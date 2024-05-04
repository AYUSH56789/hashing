import java.util.ArrayList;
import java.util.LinkedList;

public class CorelHashMapImp {
    static class Hashmap<K, V> { // generic class -> when type is not define
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of data nodes
        private LinkedList<Node> bucket[]; // create bucket of array of linked list of node
        private int N; // length of bucket

        @SuppressWarnings("unchecked") //why ? -> does not need to used for some versions.
        public Hashmap() {
            this.N = 4;
            this.bucket = new LinkedList[N]; // here we create array of type linked list of size 4
            // we need to specify empty linked list on every index of bucket
            for (int i = 0; i < bucket.length; i++) {
                this.bucket[i] = new LinkedList<>(); // this create empty linked list on every index of bucket
            }
        }

        // HELPER-1 --> rehashing()
        @SuppressWarnings("unchecked")
        private void reHashing(){
            // 1. store all data nodes from bucket -> oldBucket;
            LinkedList<Node> oldBucket[]=bucket;
            // 2. clear bucket => by increasing the size of bucket to 2*N and initializing each bucket index to empty linked list 
            bucket=new LinkedList[2*N]; // new length
            N=2*N;
            for (int i = 0; i < N; i++) {
                this.bucket[i]=new LinkedList<Node>(); //initializing each bucket index to empty linked list 
            }
            // 3. now remove each data node from oldBucket and put into new bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll=oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.remove();
                    put(node.key, node.value);
                }
            } 
            
        }
        // HELPER-2 -->hashfunction()
        private int hashFunction(K key){
            int hashValue=key.hashCode(); //hashcode can be 12345, -1234 or any random value
            Math.abs(hashValue); //transform hashCode value into absolute value
            int bucketIndex= hashValue % N; //bucket index should be between 0-3 -> so modulas of 4 with any number is between 0 to 3 as remender.

            return bucketIndex;
        }

        // HELPER-3 --> searchLL()
        public int searchLL(K key,int bucketIndex){
            LinkedList<Node> ll=bucket[bucketIndex];
            int di=0;
            for (int i = 0; i < ll.size(); i++) {
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        // insert data in hashMap by giving key and value
        public void put(K key ,V value){
            //1.find bucket index -> use hashFunction()
            int bucketIndex=hashFunction(key);
            //2.seach in linked list
            int dataIndex=searchLL(key,bucketIndex);
            //3.based on search result add new node or update existing node
            if(dataIndex!=-1){
                // update that data node
               Node node= bucket[bucketIndex].get(dataIndex);
               node.value=value;
            }
            else{
                // add new data node
                bucket[bucketIndex].add(new Node(key,value));
                n++;
            }
            // 4.now at the end check lambda value is less than or equal to threshhold value or greater than threshgold value
            double lambda=n/N; 
            if(lambda>2.0){
                reHashing();
            }
        }

        // check key is exist or not
        public boolean conatinsKey(K key){
            //1.find bucket index -> use hashFunction()
            int bucketIndex=hashFunction(key);
            //2.seach in linked list
            int dataIndex=searchLL(key,bucketIndex);
            //3.based on search result add new node or update existing node
            if(dataIndex!=-1){
                // if dataIndex found than return true
               return true;
            }
            else{
                // else return false
                return false;
            }
        }

        // get value by giving  the key
        public V get(K key){
            //1.find bucket index -> use hashFunction()
            int bucketIndex=hashFunction(key);
            //2.seach in linked list
            int dataIndex=searchLL(key,bucketIndex);
            //3.based on search result add new node or update existing node
            if(dataIndex!=-1){
                // if dataIndex found than return value
               Node node= bucket[bucketIndex].get(dataIndex);
               return node.value;
            }
            else{
                // else return null
                return null;
            }
        }

        // remove  a pair by given key
        public V remove(K key){
            //1.find bucket index -> use hashFunction()
            int bucketIndex=hashFunction(key);
            //2.seach in linked list
            int dataIndex=searchLL(key,bucketIndex);
            //3.based on search result add new node or update existing node
            if(dataIndex!=-1){
                // if dataIndex found than remove that node 
               Node node= bucket[bucketIndex].remove(dataIndex);
               n--;
               return node.value;
            }
            else{
                // else return null
                return null;
            }
        }
        
        // return all keys
        public ArrayList keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll=bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        
        // return size
        public int size(){
            return n;
        }
    }
    public static void main(String[] args) {
        Hashmap<String,Integer> hm=new Hashmap<>();
        hm.put("ayush",100);
        hm.put("rehan",20);
        hm.put("dhruv",10);
        hm.put("ansul",50);
        System.out.println(hm.get("ayush"));// should print 100
        System.out.println(hm.conatinsKey("ayush"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        ArrayList<String> keys=hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}

/*
output:
100
true
false
4
ansul
ayush
rehan
dhruv
*/
class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        
        Node(){}
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public void insert(Node node) {
        cache.put(node.key, node);
        
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    public void remove(Node node) {
        cache.remove(node.key);
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    
    private Node head = new Node();
    private Node tail = new Node();
    private int capacity;
    private HashMap<Integer, Node> cache = new HashMap();

    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            this.remove(node);
            this.insert(node);
            
            return node.val;
        } 
        
        return -1; 
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            this.remove(cache.get(key));
        }
        if (cache.size() == capacity) {
            this.remove(tail.prev);
        }
        
        this.insert(new Node(key, value));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
import java.util.HashMap;
import java.util.Map;

public class Ex6 {
    public static void main(String[] args) {
        MysDS mds = new MysDS();
        for (int i = 0; i < 10; i++) {
            mds.add(i);
        }
        System.out.println(mds);
        mds.remove(5);
        System.out.println(mds);
    }
}

class MysDS {
    class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    Map<Integer, Node> map;

    public MysDS() {
        map = new HashMap<>();
    }

    void add(int val) {
        if (!map.containsKey(val)) {
            Node node = new Node(val);
            map.put(val, node);

            if (head == null) {
                head = node;
            } else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
        }
    }

    public void remove(int val) {
        if (map.containsKey(val)) {
            Node node = map.get(val);
            if (node == head) {
                head = node.next;
                if (head != null) {
                    head.prev = null;
                }
            } else if (node == tail) {
                tail = node.prev;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            map.remove(val);
        }
    }

    @Override
    public String toString() {
        String ret = "";
        Node cur = head;
        while (cur.next!= null){
            ret += cur.value+", ";
            cur = cur.next;
        }
        ret+=cur.value +"\n";
        return ret;
    }
}

public class Node {

        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    public Node search(Node root, int key) {
        // Nếu nút gốc null hoặc nút gốc chứa giá trị cần tìm
        if (root == null || root.key == key)
            return root;

        // Nếu giá trị cần tìm nhỏ hơn giá trị của nút gốc
        if (root.key > key)
            return search(root.left, key);
    }
}

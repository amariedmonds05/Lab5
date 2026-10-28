
public class Graph {
    private int vertices;
    private int[][]adjacency_mat;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency_mat = new int[vertices][vertices];
    }

    public void add_edges(int from, int to) {
        this.adjacency_mat[from][to] = 1;
        this.adjacency_mat[to][from] = 1;
    }

    public void display_matrix() {
        // Iterate through each row
        for (int i = 0; i < adjacency_mat.length; i++) {

            // Iterate through each column
            for (int j = 0; j < adjacency_mat[i].length; j++) {
                System.out.print(adjacency_mat[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Check whether two vertices are directly connected
    public void connectedness(int from, int to) {
        if (from < 0 || from >= vertices ||
                to < 0 || to >= vertices) {
            System.out.println("Invalid vertex number.");
            return;
        }

        if (adjacency_mat[from][to] == 1) {
            System.out.println(
                    "Vertex " + from + " and vertex " + to
                            + " are connected."
            );
        } else {
            System.out.println(
                    "Vertex " + from + " and vertex " + to
                            + " are not directly connected."
            );
        }
    }

    // List all adjacent nodes of a given vertex
    public void adjacent_nodes(int vertex) {
        if (vertex < 0 || vertex >= vertices) {
            System.out.println("Invalid vertex number.");
            return;
        }

        System.out.print("Adjacent nodes of vertex "
                + vertex + ": ");

        boolean found = false;

        for (int i = 0; i < vertices; i++) {
            if (adjacency_mat[vertex][i] == 1) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }

        System.out.println();
    }
}
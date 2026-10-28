//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // https://github.com/amariedmonds05/Lab5.git

        Graph g = new Graph(5);

        g.add_edges(0, 1);
        g.add_edges(0, 3);
        g.add_edges(1, 4);
        g.add_edges(0, 2);
        g.add_edges(2, 3);

        System.out.println("Adjacency Matrix:");
        g.display_matrix();

        System.out.println("\nChecking Connectedness:");
        g.connectedness(0, 1);
        g.connectedness(0, 4);

        System.out.println("\nAdjacent Nodes:");
        g.adjacent_nodes(0);
        g.adjacent_nodes(2);
    }
}
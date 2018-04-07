import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");
        Vertex vertex3 = new Vertex("D");

        vertex0.addAdjacency(vertex0, vertex1);
        vertex0.addAdjacency(vertex0, vertex2);
        vertex1.addAdjacency(vertex1,vertex2);
        vertex2.addAdjacency(vertex2, vertex3);

        ArrayList<Vertex> vertices = new ArrayList<>();
        vertices.add(vertex0);
        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);

        ListToMatrix listToMatrix = new ListToMatrix(vertices);
        listToMatrix.convertMatrix();


    }

}

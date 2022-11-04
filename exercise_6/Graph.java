public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 16;
        int noEdges = 16;
        Graph myGraph = new Graph(noVertices, noEdges);

       // create graph

        // Edge 1
        myGraph.edge[0].src = "Cheng";
        myGraph.edge[0].dest = "Ronelyn";

        // Edge 2
        myGraph.edge[1].src = "Cheng";
        myGraph.edge[1].dest = "Jap";

        // Edge 3
        myGraph.edge[2].src = "Cheng";
        myGraph.edge[2].dest = "Marjorie";

        myGraph.edge[3].src = "Cheng";
        myGraph.edge[3].dest = "Nica";

        // Edge 4
        myGraph.edge[4].src = "Cheng";
        myGraph.edge[4].dest = "Jushua";


        // Edge 5
        myGraph.edge[5].src = "Ronelyn";
        myGraph.edge[5].dest = "Jap";

        // Edge 6
        myGraph.edge[6].src = "Ronelyn";
        myGraph.edge[6].dest = "Marjorie";

        myGraph.edge[7].src = "Ronelyn";
        myGraph.edge[7].dest = "Nica";

        // Edge 7
        myGraph.edge[8].src = "Ronelyn";
        myGraph.edge[8].dest = "Jushua";

        // Edge 8
        myGraph.edge[9].src = "Jap";
        myGraph.edge[9].dest = "Marjorie";

        //Edge 9
        myGraph.edge[10].src = "Jap";
        myGraph.edge[10].dest = "Nica";

        //Edge 10
        myGraph.edge[11].src = "Jap";
        myGraph.edge[11].dest = "Jushua";

        //Edge 11
        myGraph.edge[12].src = "Marjorie";
        myGraph.edge[12].dest = "Nica";

        //Edge 12
        myGraph.edge[13].src = "Marjorie";
        myGraph.edge[13].dest = "Jushua";

        //Edge 13
        myGraph.edge[14].src = "Marjorie";
        myGraph.edge[14].dest = "Ella";

        //Edge 14
        myGraph.edge[15].src = "Jushua";
        myGraph.edge[15].dest = "Leemer";


        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
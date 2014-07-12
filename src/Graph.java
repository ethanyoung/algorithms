import java.util.*;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Zhiyi Yang
 * Date: 19/01/14
 * Time: 4:04 PM
 */
public class Graph {
    class Vertex implements Comparable<Vertex>{
        String key;
        List<Edge> adjacentEdges;
        boolean explored;

        @Override
        public int compareTo(Vertex o) {
            return this.key.compareTo(o.key);
        }
    }
    class Edge{
        String key;
        Vertex orign;
        Vertex destination;
    }
    List<Vertex> vertexList;
    List<Edge> edgeList;

    public Vertex inserVertex () {
        return null;
    }

    public Edge insertEdge (String v, String w) {
        return null;
    }

    public void removeVertex () {

    }

    public void removeEdge(String v, String w) {

    }

    public void DFS(Vertex v){
        v.explored = true;

        for (Edge e: v.adjacentEdges) {
            if (v == e.orign) {
                Vertex w= e.destination;
                if(!w.explored) {
                    DFS(w);
                }
            }
        }
    }

    public void BFS(Vertex v) {
        List<Queue<Vertex>> levels = new ArrayList<Queue<Vertex>>();
        Queue<Vertex> level0 = new LinkedList<Vertex>();
        level0.add(v);
        levels.add(level0);
        v.explored = true;
        int i=0;
        while(!levels.get(i).isEmpty()){
            Queue<Vertex> nextLevel = new LinkedList<Vertex>();
            for (Vertex u: levels.get(i)) {
                for(Edge e: u.adjacentEdges){
                    if(v == e.orign) {
                        Vertex w = e.destination;
                        if (!w.explored){
                            levels.get(i+1).add(w);
                            w.explored = true;
                        }
                    }
                }
            }
            i++;
        }
    }


}

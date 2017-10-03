/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmgraphsearch;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author macbook
 */
public class AlgorithmGraphSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static Integer BreadthFirstSearch
        (int idOfSearchingVertic, Map<Integer, Integer> graph, Boolean[][] priority)
        {
            Queue<Integer> que = new LinkedList<Integer>();
            
            que.add(0);
            if(idOfSearchingVertic == graph.get(0))
            {
                return graph.get(0);
            }
            
            while(!que.isEmpty())
            {
                int i = que.poll();
                
                for( int j = 0; j<graph.size(); j++)
                {
                    if (priority[i][j])
                    { 
                        if(idOfSearchingVertic==j) return graph.get(j);
                        else que.add(j);
                    }
                }
            }
            return null;
            
            
        }
}

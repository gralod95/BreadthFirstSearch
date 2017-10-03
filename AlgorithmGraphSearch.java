/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmgraphsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        (Object idOfSearchingVertic, Map<Integer,
                Object> graph, Boolean[][] priority)
        {
            Queue<Integer> que = new LinkedList<Integer>();
            
            que.add(0);
            if(idOfSearchingVertic == graph.get(0))
            {
                return 0;
            }
            
            while(!que.isEmpty())
            {
                int i = que.poll();
                
                for( int j = 0; j<graph.size(); j++)
                {
                    if (priority[i][j])
                    { 
                        if(idOfSearchingVertic==graph.get(j)) return j;
                        else que.add(j);
                    }
                }
            }
            return -1;
            
            
        }
        
    public static Integer DepthFirstSearch
        (Object idOfSearchingVertic, Map<Integer,
                Object> graph, Boolean[][] priority)
        {
            List<Integer> grabing = new ArrayList<Integer>();
            int cursor = 0;
            
            if(idOfSearchingVertic == graph.get(0))
            {
                return 0;
            }
            
            return logic(idOfSearchingVertic, cursor, graph, priority, grabing);
        }
        private static Integer logic(
                Object idOfSearchingVertic, int cursor,
                Map<Integer,Object> graph, Boolean[][] priority,
                List<Integer> grabing)
        {   
            for( int j = 0; j<graph.size(); j++)
            {
                if (priority[cursor][j])if(!grabing.contains(j))
                {
                    grabing.add(j);
                    if(idOfSearchingVertic==graph.get(j)) return j;
                    else logic(idOfSearchingVertic, j, graph, priority, grabing);
                }
            }
            for( int j = 0; j<graph.size(); j++)
            {
                if (priority[j][cursor])
                    logic(idOfSearchingVertic, j, graph, priority, grabing);
            }
            return -1;
        }
}

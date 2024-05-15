
import java.util.List;
public class DepthFirst {
    public static boolean searchpath(int [][]maze,int x,int y,
    List<Integer> path){
        if(maze[y][x]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x]==0){
            maze[y][x]=2;
            int idx=-1;
            int idy=0;
            if(searchpath(maze,x+idx,y+idy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
             idx=1;
             idy=0;
            if(searchpath(maze,x+idx,y+idy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
             idx=0;
             idy=-1;
            if(searchpath(maze,x+idx,y+idy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
             idx=0;
             idy=1;
            if(searchpath(maze,x+idx,y+idy,path)){
                path.add(x);
                path.add(y);
                return true;
            }

        }
        return false;
    }
}

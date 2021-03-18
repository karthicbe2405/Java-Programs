public class ShortestPath
{
    public static int n = 4;
    public static int minCount = 0;
    public static int shortestPath[][] = new int[n][n];
    public static int a[][] = 
                    {
                    {1,1,1,1},
		            {1,1,0,1},
		            {1,1,0,1},
		            {1,1,0,1}};

    public static boolean goal(int x,int y){
        if(x == n-1 && y == n-1 && a[x][y] == 1)
            return true;
        else
            return false;
    }
    
    
     

    public static boolean valid(int x,int y,int solution[][]){
        if(x  <n && y <n && x >= 0&& y>=0 && a[x][y] == 1 && solution[x][y] != 1)
            return true;
        else
            return false;
    }


    public static boolean solve(int x,int y,int solution[][],int count){
        if(goal(x,y))
        {
        solution[x][y]=1;
        
        count++;
        
        /*for(int i = 0;i < 4;i++)
        {
            for(int j = 0;j < 4;j++)
                System.out.print(solution[i][j]+" ");
            System.out.println();
        }
        
        System.out.println();
        
        */
        if(minCount == 0 || minCount > count){
            minCount = count;
            for(int i = 0;i < n;i++)
                System.arraycopy(solution[i],0,shortestPath[i],0,n);
        }
        //return true;
    }
     
           
        if(valid(x,y,solution))
        {
                             
                    solution[x][y] = 1;
                        
     
                    if(solve(x+1,y,solution,count+1))
                        return true;
                   
                    if(solve(x,y-1,solution,count+1))
                        return true;
                    
                    if(solve(x,y+1,solution,count+1))
                        return true;
                    
                    if(solve(x-1,y,solution,count+1))
                        return true; 

                      solution[x][y] = 0;
        }

        return false;
    }


	public static void main(String[] args) {
		
		int solution[][] = new int[n][n];
		for(int i = 0;i < n;i++)
		    for(int j = 0;j < n;j++)
		        solution[i][j] = 0;
		if(solve(0,0,solution,0))
        {
		    System.out.println("Sucess");

        }
        else{
            if(minCount != 0){
                System.out.println("Shortest Path : ");
                for(int i = 0;i < 4;i++){
                    for(int j = 0;j < 4;j++)
		                System.out.print(shortestPath[i][j] + " ");
		        System.out.println();
                }    
            }
            else{
                System.out.println("Path Not Found");
            }
        }
	}
}
import java.util.*;
class binaryEquivalence{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer,Integer> hmOne = new HashMap<Integer,Integer>();
        //HashMap<Integer,Integer> hmZero = new HashMap<Integer,Integer>();
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt(),count = 0;
        System.out.println("Enter the Elements : ");
        for(int i = 0;i < n;i++){
            arr.add(scan.nextInt());
            hmOne.put(arr.get(i),Integer.bitCount(arr.get(i)));
        }
        int maxLength = Integer.toBinaryString(Collections.max(arr)).length();

        for(int i = 0 ; i < arr.size();i++){
            for(int j = i+1;j < n;j++){
                if((hmOne.get(arr.get(i)) + hmOne.get(arr.get(j))) == ((maxLength - hmOne.get(arr.get(i))) + (maxLength - hmOne.get(arr.get(j))))){
                    //System.out.println(arr.get(i) + " " + arr.get(j));
                    count++;
                }
            }
        }

        String result = Integer.toBinaryString(count);
        while((result.length() < maxLength)){
                result = "0" + result;
        }

        System.out.println(result);

    }
}
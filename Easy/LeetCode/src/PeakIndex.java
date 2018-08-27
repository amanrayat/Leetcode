
public class PeakIndex {

    public int peakIndexInMountainArray(int[] A) {
   int i , j = 0;
   for(i = 0 ; i<= A.length-1 ;i++){
       if(A[i]>A[i+1]){
       return i;
       }
//       else if(A[j]<A[j-1]){
//           return A.length-j;
//       }
   	}
   return 0;
   }
    
	public static void main(String args[]) {
		int [] input = {0,1,2,3,4,2,1};
		PeakIndex unique = new PeakIndex();
		System.out.println(unique.peakIndexInMountainArray(input));
		
	}
}
 
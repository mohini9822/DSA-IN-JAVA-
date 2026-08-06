import java.util.*;
public class LinearSearchPro {

	
	
	public static int trappedRainWater(int height[]) {
		int n=height.length;
		//calculate leftmax boundary array
		int leftMax[]= new int[n];
		leftMax[0]=height[0];
		 
		for(int i=1;i<height.length;i++) {
			leftMax[i]=Math.max(height[i],leftMax[i-1]);
		}
		
		//calculate rightMax Boundary array
		int rightMax[]=new int[n]; 
		rightMax[n-1] = height[n-1]; 
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(height[i], rightMax[i+1]);
		}
		//loop
		int trappedWater=0;
		for(int i=0;i<n;i++) {
			//calculate water level ==> max(leftmax,rightmax)
		int waterLevel=Math.min(leftMax[i], rightMax[i]);
		// trapped water = wl-hight
		trappedWater+=waterLevel-height[i];
		} 
		return trappedWater;
}
public static void main(String[] args) {
//		int num[]= {1,-2,6,-1,3};
//		MaxSubArraysum(num);
	
	int height[]= {4,2,0,6,3,2,5};
	
	System.out.print(trappedRainWater(height));
	
 }

}

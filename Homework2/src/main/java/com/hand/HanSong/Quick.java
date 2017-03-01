package com.hand.HanSong;

public class Quick{
	public static void main(String[] args) {
		new Quick();
	}
		int a[] = {2,3,5,2,1,4,2,6};
		public Quick(){
			System.out.println("原始无排序的数组：2 3 5 2 1 4 2 6");
			quick(a);
			System.out.print("快速排序后的数组：");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
		
			}
	
		}
	
	public int getMid(int[] l,int low, int hig){
		int temp = l[low];  	//基准元素
		while(low < hig){
		while(low < hig && l[hig] >= temp){
			hig--;
		}
		l[low] = l[hig]; 		//比基准元素小的记录移动到后端
		while(low < hig && l[low] <= temp){
			low ++;
		}
		l[hig] = l[low]; 		//比基准元素大的记录移动到前端
	}	
		l[low] = temp;				//基准元素记录到尾	
		return low;					//返回基准元素位置
	}
	public void _quick(int[] l,int low, int hig){
		if(low < hig){
		int mid = getMid(l, low, hig);
			_quick(l,low,mid-1);
			_quick(l,mid+1,hig);
		}
	}
	public void quick(int[] a2){
		if(a2.length > 0){
			_quick(a2,0,a2.length-1);
		}
	}
}

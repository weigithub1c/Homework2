package com.hand.HanSong;

public class Quick{
	public static void main(String[] args) {
		new Quick();
	}
		int a[] = {2,3,5,2,1,4,2,6};
		public Quick(){
			System.out.println("ԭʼ����������飺2 3 5 2 1 4 2 6");
			quick(a);
			System.out.print("�������������飺");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
		
			}
	
		}
	
	public int getMid(int[] l,int low, int hig){
		int temp = l[low];  	//��׼Ԫ��
		while(low < hig){
		while(low < hig && l[hig] >= temp){
			hig--;
		}
		l[low] = l[hig]; 		//�Ȼ�׼Ԫ��С�ļ�¼�ƶ������
		while(low < hig && l[low] <= temp){
			low ++;
		}
		l[hig] = l[low]; 		//�Ȼ�׼Ԫ�ش�ļ�¼�ƶ���ǰ��
	}	
		l[low] = temp;				//��׼Ԫ�ؼ�¼��β	
		return low;					//���ػ�׼Ԫ��λ��
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

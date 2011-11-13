package sort;

public class QuickSort {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable[] data,int low,int high){
		// ��ŦԪ��һ���Ե�һ��Ԫ��Ϊ��׼���л���
		int i = low;
		int j = high;
		if (low < high) {
			// ���������˽�������м�ɨ��
			Comparable pivotKey = data[low];
			// ����ɨ���ָ��i,j;i����߿�ʼ��j���ұ߿�ʼ
			while (i < j) {
				while (i < j && data[j].compareTo(pivotKey) > 0) {
					// �ҵ���ŦֵԪ��С��Ԫ��index j
					j--;
				}
				
				if (i < j) {
					// ����ŦԪ��С���ƶ������
					data[i] = data[j];
					i++;
				}
				
				while (i < j && data[i].compareTo(pivotKey) < 0) {
					// �ҵ�����ŦԪ�ش��Ԫ��index
					i++;
				}
				
				if (i < j) {
					// ����ŦԪ�ش���ƶ����ұ�
					data[j] = data[i];
					j--;
				}
			}
			// ��ŦԪ���ƶ�����ȷλ��
			data[i] = pivotKey;
			// ǰ����ӱ�ݹ�����
			sort(data,low,i - 1);
			// �����ӱ�ݹ�����
			sort(data,i + 1,high);
		}// end if
	}// end sort
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// ��JDK1.5�汾���ϣ������������Ϳ����Զ�װ��
		// int,double�Ȼ������͵İ�װ����ʵ����Comparable�ӿ�
		Comparable[] c = { 4,9,23,1,45,27,3,2 };
		sort(c,0,c.length - 1);
		for (Comparable data : c) {
			System.out.println(data);
		}
	}
}

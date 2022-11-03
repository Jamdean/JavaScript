package ch06.sec07.exam06;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] season = { "Spring", "Summer" };
		
//		season[1] = "여름";
		System.out.println("season[1]:" + season[1]);
		
		int[] scores = {83, 90, 87};	//배열 모임 만들기
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		int avg = (int) sum/3;
		System.out.println("평균: " + avg);
		
		double avg2 = (double) sum/3;
		System.out.println("평균: " + avg2);
		
		int[] jam = new int[5];			// 배열 길이 만들기
		
		int[][]jam2 = new int[2][3];
		
		String[]jam3 = new String[3];
		jam3[0] = "Java";
		jam3[1] = "C++";
		jam3[2] = "C#";
		
	
		//배열 복사
		int[] oldIntArray = {1, 2, 3}; 		//길이가 3인배열
		
		int[] newIntArray = new int[5];		//길이 5인 배열을 새로 생성.
				
		for(int i=0; i<oldIntArray.length; i++) {	//배열항목 복사.
			newIntArray[i] = oldIntArray[i];
			
																//복사 항목 수(old 전체)
			System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
											//새배열 	//새배열
													//붙여넣기시작인덱스
		}
		
	}

}

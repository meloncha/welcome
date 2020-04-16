//랜덤으로 O나 X를 10번 출력하는데 최대로 연속된 O, X의 갯수를 구하여라

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre = -1; //처음에 이전값은 없기때문에 0이 아닌 -1로 초기화.
		int count = 0, rand, maxO = 0, maxX = 0;
		/*
		 * 반복문 첫번째시 pre는 -1값으로 초기화되어있어 else문(rand != pre)으로 들어간다.
		 * 현재 값이 O든 X든 카운트는 1이 된다. 그리고 현재값에 따라 밑의 if/else문을 지나가고
		 * 마지막에 현재값을 pre에 집어넣고 다음 연산부터 활용한다.
		 * 
		 * 반복문 두번째 부터 이전값과 현재값을 비교하면 
		 * pre rand 
		 * 0	0	: 같은 0이므로 카운트(0) 1증가, 최대 0값 체크
		 * 0	1	: 0에서 1로 변했으므로 카운트(1) 1 세팅, 최대 1값 체크
		 * 1	0	: 1에서 0으로 변했으므로 카운트(0) 1 세팅, 최대 0값 체크
		 * 1	1	: 같은 1이므로 카운트(1) 1증가, 최대 1값 체크
		 * 이전값과 현재값이 같으면 카운트 1증가, 현재값에 따라 최대값 체크
		 * 이전값과 현재값이 다르면 카운트 1로 초기화, 현재값에 따라 최대값 체크
		 * 매번 마지막에 현재값을 이전값변수 pre에 대입하여 다음 연산에서 활용한다.
		 */
		for(int i = 0; i < 10; i++) {
			rand = (int)(Math.random() * 2); // rand의 값은 0 or 1. 0이면 O, 1이면 X라고 가정.
			
			if(rand == pre) { //rand와 pre가 같을 경우 카운트는 하나 증가
				count++;
			}
			else { //rand와 pre가 다를 경우 count는 1로 초기화
				count = 1;							
			}
			
			if(rand == 0) { //현재 값이 0인 경우 maxO과 현재 카운트와 비교
				System.out.print("O");
				if(count > maxO) {
					maxO = count;
				}
			}
			else { // 현재 값이 1인 경우 maxX와 현재 카운트와 비교
				System.out.print("X");
				if(count > maxX) {
					maxX = count;
				}
			}
			
			pre = rand;
		}
		System.out.println("");
		System.out.println("O : " + maxO);
		System.out.println("X : " + maxX);
	}

}

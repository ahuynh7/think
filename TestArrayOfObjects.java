public class Main {
	int objNum;
	
	public Main(int inp) {
		objNum = inp;
	}
	
	public void printObjNum(Main o) {
		System.out.println(o.objNum);
	}
	
	public static void main(String[] args) {
		Main[] obj = new Main[2];
		
		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Main(i + 1);
			
			obj[i].printObjNum(obj[i]);
		}
	}
}

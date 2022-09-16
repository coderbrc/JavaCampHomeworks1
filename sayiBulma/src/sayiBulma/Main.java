package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,2,3,4,5};
		int aranacak=10;
		boolean varMı=false;
		int index=0;
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==aranacak) {
				varMı=true;
				index=i;
				break;
			}
		}
		if(varMı) {
			System.out.println(aranacak+" dizinin "+index+". indexli sayısıdır.");
		}
		else {
			System.out.println(aranacak+" sayısı dizide yoktur.");
		}
	}

}

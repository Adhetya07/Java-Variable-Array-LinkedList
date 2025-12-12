import java.util.LinkedList;

public class Tugas1StrukturData {
//Sonie Adhetya NIM 053652575
	public static void main(String[] args) {
				
	//Nomor 1
		int StrukturBaris;
		StrukturBaris=7;
		System.out.println("StrukturBaris = "+StrukturBaris);
		
	//Nomor 2
		String KataBaru;
		KataBaru="Deklarasi tipe data String";
		System.out.println(KataBaru);
		
	//Nomor 3
		int[] empatAngka=new int[4];
		empatAngka[0]=(07);
		empatAngka[1]=(10);
		empatAngka[2]=(20);
		empatAngka[3]=(23);
		System.out.println("empatAngka = ");
		for (int i=0;i<empatAngka.length;i++) {
		System.out.print(empatAngka[i]+"\t");
		}
		System.out.println();
		
	//Nomor 4
		String[][] Angka= {
				{"1","3","5"},
				{"14","19","20"},
				{"22","27","29"},
		};
		System.out.println("Angka =");
		for(int x=0;x<Angka.length;x++) {
		for(int y=0;y<Angka.length;y++) {
		System.out.print(Angka [x][y]+"\t");
		}
		System.out.println();
		}
		
	//Nomor 5
		LinkedList<Integer> list = new LinkedList<>();
		list.add(22);
		list.add(19);
		list.add(44);
		list.add(60);
		list.add(72);
		System.out.println("listAngka = "+list);
			
				
		}
		}
        
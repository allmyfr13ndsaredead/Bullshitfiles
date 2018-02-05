import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Midterm {
	 private ArrayList<String> lyrics;
	 private ArrayList<String> subLyrics;
	 private ArrayList<String> pangngalan;
	 private ArrayList<String> panghalip;
	 private ArrayList<String> pandiwa;
	 private ArrayList<String> pangatnig;
	 private ArrayList<String> pangukol;
	 private ArrayList<String> pangangkop;
	 private ArrayList<String> panguri;
	 private ArrayList<String> pangabay;
	 private ArrayList<String> pantukoy;
	 private ArrayList<String> pangawing;
	 private ArrayList<String> pangngalanOut;
	 private ArrayList<String> panghalipOut;
	 private ArrayList<String> pandiwaOut;
	 private ArrayList<String> pangatnigOut;
	 private ArrayList<String> pangukolOut;
	 private ArrayList<String> pangangkopOut;
	 private ArrayList<String> panguriOut;
	 private ArrayList<String> pangabayOut;
	 private ArrayList<String> pantukoyOut;
	 private ArrayList<String> pangawingOut;
	 private ArrayList<String> letters;
	 private ArrayList<ArrayList> container;
	 private Scanner sc;
	 private FileReader fr;
	 private File file;
	Midterm() throws Exception
	{
		pangngalanOut = new ArrayList();
		panghalipOut = new ArrayList();
		pandiwaOut = new ArrayList();
		pangatnigOut = new ArrayList();
		pangukolOut = new ArrayList();
		pangangkopOut = new ArrayList();
		panguriOut = new ArrayList();
		pangabayOut = new ArrayList();
		pantukoyOut = new ArrayList();
		pangawingOut = new ArrayList();
		lyrics = new ArrayList();
		String[] letters = {"a","b","c","d","e","f","g","h","i","j"};
		file = new File("C:/Users/Keith/Desktop/Midterm/Input.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			String temp = sc.next();
			temp = temp.replace(".", "");
			temp = temp.replace(",", "");
			if(lyrics.contains(temp))
			{
				continue;
			}
			else
			{
				lyrics.add(temp);
			}
		}
		subLyrics = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Input.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			String temp = sc.next().toLowerCase();
			temp = temp.replace(".", "");
			temp = temp.replace(",", "");
			if(subLyrics.contains(temp))
			{
				continue;
			}
			else
			{
				subLyrics.add(temp);
			}	
		}
		pangngalan = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pangngalan.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pangngalan.add(sc.next());
		}
		panghalip = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Panghalip.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			panghalip.add(sc.next());
		}
		pandiwa = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pandiwa.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pandiwa.add(sc.next());
		}
		pangatnig = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pangatnig.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pangatnig.add(sc.next());
		}
		pangukol = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pang-ukol.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pangukol.add(sc.next());
		}
		pangangkop = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pang-angkop.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pangangkop.add(sc.next());
		}
		panguri = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pang-uri.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			panguri.add(sc.next());
		}
		pangabay = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pang-abay.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pangabay.add(sc.next());
		}
		pantukoy = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pantukoy.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pantukoy.add(sc.next());
		}
		pangawing = new ArrayList();
		file = new File("C:/Users/Keith/Desktop/Midterm/Pangawing.txt");
		fr = new FileReader(file);
		sc = new Scanner(fr);
		while(sc.hasNext())
		{
			pangawing.add(sc.next());
		}
		for(int i = 0;i<subLyrics.size();i++)
		{
			
			if(pangngalan.contains(subLyrics.get(i)))
			{
				
				pangngalanOut.add(lyrics.get(i));
			}
			if(panghalip.contains(subLyrics.get(i)))
			{
				
				panghalipOut.add(lyrics.get(i));
			}
			if(pandiwa.contains(subLyrics.get(i)))
			{
				
				pandiwaOut.add(lyrics.get(i));
			}
			if(pangatnig.contains(subLyrics.get(i)))
			{
				
				pangatnigOut.add(lyrics.get(i));
			}
			if(pangukol.contains(subLyrics.get(i)))
			{
				
				pangukolOut.add(lyrics.get(i));
			}
			if(pangangkop.contains(subLyrics.get(i)))
			{
				
				pangangkopOut.add(lyrics.get(i));
			}
			if(panguri.contains(subLyrics.get(i)))
			{
				
				panguriOut.add(lyrics.get(i));
			}
			if(pangabay.contains(subLyrics.get(i)))
			{
				
				pangabayOut.add(lyrics.get(i));
			}
			if(pantukoy.contains(subLyrics.get(i)))
			{
				
				pantukoyOut.add(lyrics.get(i));
			}
			if(pangawing.contains(subLyrics.get(i)))
			{
				
				pangawingOut.add(lyrics.get(i));
			}
		}
		container = new ArrayList();
		container.add(pangngalanOut);
		container.add(panghalipOut);
		container.add(pandiwaOut);
		container.add(pangukolOut);
		container.add(pangatnigOut);
		container.add(pangangkopOut);
		container.add(panguriOut);
		container.add(pangabayOut);
		container.add(pantukoyOut);
		container.add(pangawingOut);
		for(int x = 0;x<container.size();x++)
		{
			if(x == 0)
			{
				System.out.println(+(x+1)+" Pangngalan : ");
				for(int i = 0;i<pangngalanOut.size();i++)
				{
					System.out.print((letters[i])+". "+pangngalanOut.get(i)+"\n");
				}
			}
			if(x == 1)
			{
				System.out.println("\n"+(x+1)+" Panghalip : ");
				for(int i = 0;i<panghalipOut.size();i++)
				{
					System.out.print((letters[i])+". "+panghalipOut.get(i)+"\n");
				}
			}
			if(x == 2)
			{
				System.out.println("\n"+(x+1)+" Pandiwa : ");
				for(int i = 0;i<pandiwaOut.size();i++)
				{
					System.out.print((letters[i])+". "+pandiwaOut.get(i)+"\n");
				}
			}
			if(x == 3)
			{
				System.out.println("\n"+(x+1)+" Pangatnig : ");
				for(int i = 0;i<pangatnigOut.size();i++)
				{
					System.out.print((letters[i])+". "+pangatnigOut.get(i)+"\n");
				}
			}
			if(x == 4)
			{
				System.out.println("\n"+(x+1)+" Pang-ukol : ");
				for(int i = 0;i<pangukolOut.size();i++)
				{
					System.out.print((letters[i])+". "+pangukolOut.get(i)+"\n");
				}
			}
			if(x == 5)
			{
				System.out.println("\n"+(x+1)+" Pang-angkop : ");
				for(int i = 0;i<pangangkopOut.size();i++)
				{
					System.out.print((letters[i])+". "+pangangkopOut.get(i)+"\n");
				}
			}
			if(x == 6)
			{
				System.out.println("\n"+(x+1)+" Pang-uri : ");
				for(int i = 0;i<panguriOut.size();i++)
				{
					System.out.print((letters[i])+". "+panguriOut.get(i)+"\n");
				}
			}
			if(x == 7)
			{
				System.out.println("\n"+(x+1)+" Pang-abay : ");
				for(int i = 0;i<pangabayOut.size();i++)
				{
					System.out.print((letters[i])+". "+pangabayOut.get(i)+"\n");
				}
			}
			if(x == 8)
			{
				System.out.println("\n"+(x+1)+" Pantukoy : ");
				for(int i = 0;i<pantukoyOut.size();i++)
				{
					System.out.print((letters[i])+". "+pantukoyOut.get(i)+"\n");
				}
			}
			if(x == 9)
			{
				System.out.println("\n"+(x+1)+" Pangawig : ");
				for(int i = 0;i<pangawingOut.size();i++)
				{
					System.out.print((letters[i])+". "+pangawingOut.get(i)+"\n");
				}
			}
		}
		
	}
	

	public static void main(String[] args) throws Exception
	{
		Midterm mt = new Midterm();
	}
}

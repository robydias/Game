package gamePackage;
import java.util.ArrayList;
import java.util.Random;
public class GameLotto {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList();
//////??????????//-----------
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int z = random.nextInt(49);  // random.nextInt(100);
            arrayList.add(z);
                ;
            }
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        }
    }

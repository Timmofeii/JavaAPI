import javax.print.DocFlavor;
import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> pb = new HashMap<>();

    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return pb;
    }

    /**
     *
     * @param  name
     * @return
     */
    public ArrayList<Integer> find(String name) {
        if (pb.containsKey(name)) {
            return pb.get(name);
        }
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

    public void add(String name1, int phone1) {
        if (pb.containsKey(name1)) {
            pb.get(name1).add(phone1);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phone1);
            pb.put(name1, list);
        }
    }

    public void printContact() {
        List list = new ArrayList(pb.entrySet());

        Map<String, ArrayList<Integer>> sortedPb = new LinkedHashMap<>(sortHashMap(pb));
        for (Map.Entry<String, ArrayList<Integer>> entry : sortedPb.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }

    private Map<String, ArrayList<Integer>> sortHashMap(HashMap<String, ArrayList<Integer>> pb) {
        Map<String, ArrayList<Integer>> resultMap = new LinkedHashMap<>();
        int maxCountNumbers = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry : pb.entrySet()) {

            ArrayList<Integer> value = entry.getValue();

            if (value.size() > maxCountNumbers) {
                maxCountNumbers = value.size();
            }
        }


        while (pb.size()!=resultMap.size()) {

            for (Map.Entry<String, ArrayList<Integer>> entry : pb.entrySet()) {
                String key = entry.getKey();
                ArrayList<Integer> numbersList = entry.getValue();
                if (numbersList.size() == maxCountNumbers) {
                    resultMap.put(key, numbersList);

                 }
            }
            maxCountNumbers--;



        }
        return resultMap;
    }
}

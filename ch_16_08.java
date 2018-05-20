public class ch_16_08
{
    /* Write a method called switchPairs that switches the order of values in the list in a pairwise fashion. Your method
should switch the order of the first two values, then switch the order of the next two, switch the order of the next
two, and so on. If the list contains an odd number of values, the final element is not moved. For example, if the list
initially stores [10, 25, 31, 47, 52, 68, 77], your method should switch the first pair (10 and 25), the second
pair (31 and 47), and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].
*/
    public static void main(String[] args)
    {
        LinkedIntList LL = new LinkedIntList();
        LL.add(10);
        LL.add(25);
        LL.add(31);
        LL.add(47);
        LL.add(52);
        LL.add(68);

        switchPairs(LL);
    }
    public static LinkedIntList switchPairs(LinkedIntList list){
        for (int i = 0; i < list.size() ; i++)
        {
            int This = list.get(i);
            int That = list.get(i + 1);

            list.set(i + 1, This);
            list.set(i, That);
            i++;
        }
        System.out.println(list);
        return list;
    }
}

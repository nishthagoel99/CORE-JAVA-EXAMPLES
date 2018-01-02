public class practice {
    public static void main(String[] args)
    {
        int[] marks={2,55,3,553,646,6446,9};
        int maximum_marks=marks1( marks);
        int minimum_mark=marks2( marks);
        System.out.println(maximum_marks);
        System.out.println(minimum_mark);
        

    }
    public static Integer marks1(int[] number)
    {
        int maxsofar=number[0];
        for(int num:number)
        {
            if( num>maxsofar)
            {
                maxsofar=num;
            }
        }
        return maxsofar;
    }
    public static Integer marks2(int[] number)
    {
        int minsofar=number[0];
        for(int i=0;i<number.length;i++)
        {
            if(number[i]<minsofar)
            {
                minsofar=number[i];
            }
        }
        return minsofar;
    }
}

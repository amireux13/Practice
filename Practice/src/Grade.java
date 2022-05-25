public class Grade {
    String major;
    int math_grade;
    int english_grade;
    int maogai_grade;

    public Grade(){
        major = "计算机";
        math_grade = 90;
        english_grade = 80;
        maogai_grade = 70;
    }
    public static void main(String[] args) {
        Grade grade = new Grade();
            int arr[] = new int[3];
            arr[0]=grade.math_grade;
            arr[1]=grade.english_grade;
            arr[2]=grade.maogai_grade;
            int back_grade =  grade.judge(arr);
        System.out.println("数学成绩："+back_grade);
    }
    public int judge(int[] arr)
    {
        char ch[] = new char[3];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=90)
            {
                ch[i]='A';
            }
            if(arr[i]<90&&arr[i]>=80)
            {
                ch[i]='B';
            }
            if(arr[i]<80)
            {
                ch[i]='C';
            }
        }
        System.out.println("数学等级："+ch[0]+"\t英语等级："+ch[1]+"\t毛概等级:"+ch[2]);
        return arr[0];
    }

}

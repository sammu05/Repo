class length
{
    public static void main(String[] args)
    {
        String str="Hello";
        String str2=str+'#';
        len=0;
        for(int i=0;str.charAt(i)!='#')
        {
            len++;
        }
        System.out.println(len);
    }
}
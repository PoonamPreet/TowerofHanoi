
public class TowerOfHanoi {
public static void main(String[] args) {
	int n=3;
	shiftdisk(n, 'A', 'B', 'C');
}
public static void shiftdisk(int n,char TA,char TB,char TC)
{
	if(n==1)
	{
		System.out.println("Disk 1 shifted from " +TA +" to Tower "+TC);
	}
	else
	{
		shiftdisk(n-1,TA,TC,TB);
		System.out.println("Disk "+n+" from "+TA+" is shifted to " +TC);
		shiftdisk(n-1, TB, TA,TC);
	}
}
}

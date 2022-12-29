package nag;
public class sample
{
public static int binarySearch(int[] array, int target)
{
int low = 0;
int high = array.length - 1;
while (low <= high)
{
int mid = low + (high - low) / 2;
if (target == array[mid])
{
return mid;
}
else if (target < array[mid])
{
high = mid - 1;
}
else
{
low = mid + 1;
}
}
return -1;
}
public static void main(String[] args)
{
int[] array = {2,3,4,5,6,7,8,9,10};
int target = 7;
int result = binarySearch(array, target);
if (result == -1)
{
System.out.println("Target not found!");
}
else
{
System.out.println("Target found at index: " + result);
}
}
}

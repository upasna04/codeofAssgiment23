#include<iostream.h>
using namespace std;
power( int r)
{
      int i=1;
     while(r!=0)
    {
       i*=r;
       r--;
   }
}
int main()
{
     int n;
     cin>>n;
     int temp=n;
     int sum=0;
     while(n!=0)
     {
         int res=n%10;
        sum=sum+power(res);
         n=n/10;          
         
      }
   if(temp==sum)
    cout<<armstrong number;
    


}
//
Reverse number
int main()
{
   int n;
    cin>>n;
    int temp=n;
     int sum=0;
    while(n!=0)
     {
          int res=n%10;
      sum=sum*10+res;
       n=n/10;   
    }
    cout<<sum<<endl;

}
// 3rd heights 
int main()
{
  int n;
   cin>>n;
   int arr[n];
  for(int i=0;i<n;i++)
    {
         cin>>arr[i];
    }
   int first=INT_MIN;
   int second=INT_MAX;
   int third=INT_MAX;
   for(int i=0;i<n;i++)
    {
        if(arr[i]>first)
         {
            third=second;
            second=first;
            first=arr[i];
         }
        else if(arr[i]<first&&arr[i]>second)
         {
             second=arr[i];

         }
         else if(arr[i]<first&&arr[i]<second&&arr[i]>third)
         {
               third=arr[i];
          }
        cout<<third;

    }






}
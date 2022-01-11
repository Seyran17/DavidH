// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));


int l;
int w;
char sym;
int i;
int x;
cout<<"enter the length of your desired box";
cin>>l;
cout<<"enter the width of your desired box";
cin>>w;
cout<<"enter the symbol you would like to use to draw your box";
cin>>sym;
	for(i=0;i<l;i++)
	{
	for(x=0;x<w;x++)
	{
		gotoxy(x+2,i+7);
		cout<<sym;
	}
	}
	
	
	for(i=0;i<l-1;i++)
	{
	for(x=0;x<w-1;x++)
	{
		gotoxy(x+3,i+8);
		cout<<" ";
	}
	}
}



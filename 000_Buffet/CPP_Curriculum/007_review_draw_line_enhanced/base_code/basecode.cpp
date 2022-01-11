// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int x;
int y;
int l;
char sym;
int i;
	cout<<"how long do you want the line?"<<endl;
	cin>>l;
		cout<<"what symbol do you want the line to be?"<<endl;
		cin>>sym;
			cout<<"what is the x-cordinate of your line?"<<endl;
			cin>>x;
				cout<<"what is the y-cordinate of your line?"<<endl;
				cin>>y;
for(i=0;i<l;i++)
	{
		gotoxy(x+i,y);
		cout<<sym;
	}
}
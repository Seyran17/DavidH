// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
char sym;
int i = 3;
cout<<"choose what symbol you want it to snow"<<endl;
cin>>sym;
cout<<endl;
while (true) {
gotoxy(5,i);
cout<<sym<<endl;
sleep(1);
i++;
gotoxy(5,i-1);
cout<<"  "<<endl;

	}
}
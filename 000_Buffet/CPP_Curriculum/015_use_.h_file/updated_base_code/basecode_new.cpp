// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int x = random(10);
char sym;
int r = random(10);
int i = 3;
cout<<"choose what symbol you want it to snow"<<endl;
cin>>sym;
cout<<endl;
while (true) {
gotoxy(r,i);
cout<<sym<<endl;
gotoxy(x,i);
cout<<sym;
sleep(1);
i++;
gotoxy(x,i-1);
cout<<" "<<endl;
gotoxy(r,i-1);
cout<<"  "<<endl;
	}
}

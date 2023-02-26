#include <iostream>
using namespace std;

int main() {
    
    int arr[4];
	int c;
	for(int i=0; i<4;i++){
	    cin>>arr[i];
	    if(arr[i]>=10){
	        c++;
	    }
	}
	cout<<c;
	return 0;
	
}
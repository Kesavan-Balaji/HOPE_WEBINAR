#include<iostream> 

using namespace std;

int main(){
    int T;
    cin>>T;
    while(T-->0){
        int n;
        cin >> n;
        int a[n];
        int f=0;
        for(int i=0;i<n;i++) {
            cin >> a[i];
            if(a[i]==67){
                f++;
            }
        }
        if(f>0) cout << "YES" << endl;
        else cout << "NO" << endl;
        
    }
}
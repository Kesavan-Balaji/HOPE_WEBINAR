#include<iostream> 
#include<vector>
#include<algorithm>

using namespace std;

void solve(){
    int n;
    cin >> n;
    vector<int> arr(n+1);
    for(int i=1;i<=n;i++){
        cin >> arr[i];
    }
    for(int st=1;st<=n;st+=2){
        vector<int> seq;
        seq.push_back(0);
        for(int i=st;i<=n;i=i*2){
            seq.push_back(arr[i]);
        }
        sort(seq.begin(),seq.end());
        for(int i=st,idx=1;i<=n;i=i*2,idx++){
            if(i!=seq[idx]){
                cout << "NO" << endl;
                return;
            }
        }
    }
    cout << "YES" << endl;
}

int main(){
    int T;
    cin >> T;
    while(T-->0){
        solve();
    }
}
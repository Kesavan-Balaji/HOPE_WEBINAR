#include<bits/stdc++.h>
using namespace std;
void solve(){
  int N, D, balptr=1;
  cin >> N >> D;
  vector <int> e(N+1), u(N+1), bal(N+1,0);
  for (int day=1; day<=N; day++){
    cin >> e[day];
  }
  for (int day=1; day<=N; day++){
    cin >> u[day];
  }
  for (int day=1; day<=N; day++){
    int need=u[day];
    while(balptr<day-D) balptr++;
    while(need>0 && balptr<day){
      int baluse=min(need, bal[balptr]);
      need-=baluse;
      bal[balptr]-=baluse;
      if (bal[balptr]==0) balptr++;
    }
    bal[day]=e[day]-need;
  }
  int rem=0;
  for (int day=N-D+1; day<=N; day++){
    rem+=bal[day];
  }
  cout << rem << endl;
}
int main(){
  int t;
  cin >> t;
  while(t--){
    solve();
  }
  return 0;
}
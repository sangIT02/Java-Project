#include<iostream>
#include<map>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n; cin>>n;
        map<ll,bool>a;
        for(int i = 0; i < n; i++){
            ll x; cin>>x;
            a[x] = true;
        }
        for(int i = 0; i < n; i++){
            if(a[i]){
                cout<<i<<"  ";
            }
            else{
                cout<<"-1 ";
            }
        }
        cout<<endl;
    }
    return 0;
}
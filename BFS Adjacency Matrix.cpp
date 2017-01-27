void BFS(int V)
{
        int Adj[V][V];
        for(int i=0;i<V;i++)
        {
                for(int j=0;j<V;j++)
                {
                        Adj[i][j]=0;
                }
        }
        int edges;

        for(int i=0;i<V;i++)
        {
                cout<<"Enter the Nodes Adjacent to "<<i<<endl;
                while(true)
                {
                        cin>>edges;
                        if(edges==-1)
                                break;
                        Adj[i][edges]=1;
                }
        }
        int source;
        cin>>source;
        queue<int> q;
        int Distance[V];
        for(int i=0;i<V;i++)
                Distance[i]=0;
        bool Visited[V];
        for(int i=0;i<V;i++)
                Visited[i]=false;
        q.push(source);
        Visited[source]=true;
        while(!q.empty())
        {
                source=q.front();
        for(int i=0;i<V;i++)
        {
                if(Adj[source][i]==1)
                {
                        if(Visited[i]==false)
                        {
                                Distance[i]=1+Distance[source];
                                q.push(i);
                                Visited[i]=true;
                        }
                }

        }
        q.pop();
        }
}
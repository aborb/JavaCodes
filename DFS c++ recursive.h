void DFS(int n)
{
    nodes++;           //question specific
    visited[n] = true;
    for(vector<int>::iterator i = adj[n].begin(); i != adj[n].end() ; i++)
    {
        if(!visited[*i])
            DFS(*i);
    }
}

 for(int i = 1 ; i <= N ; i++)   //question specific
        {
            if(!visited[i])
            {
                nodes = 0;
                DFS(i);
                cost = cost + X;
                if(X > Y)
                    cost = cost + (Y*(nodes-1));
                else
                    cost = cost + (X*(nodes-1));
            }
		}
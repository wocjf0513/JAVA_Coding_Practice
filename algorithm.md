>dynamic algorithm
>>각 단계의 최적의 해가 다음 단계의 최적의 해에 영향을 끼치는 것

</br>

>greedy algorithm
>>각 단계에서 수 많은 선택 중 최적이라 생각하는 선택을 하는 것

</br>

>dfs
```java
public static void dfs(String source, String target, int count,String[] words){
        if(source==target){
            if(min_search>count)
            min_search=count;
            return;
        }
        for(int i=0; i<words.length; i++){
            if(alpha1(source,words[i]) && !checked[i]){
                checked[i]=true;
                dfs(words[i],target,count+1,words);
                checked[i]=false;
            }

        }
    }
```
</br>


> bfs

```java
public static void bfs(int n,int v, int[][] numbers, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while(!queue.isEmpty()){
            v=queue.poll();
            visited[v]=true;
            for(int i=0; i<n; i++){
                if(numbers[v][i]==1 && !visited[i]){
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        answer++;
        for(int i=0; i<n; i++){
            if(visited[i]==false)
            bfs(n, i, numbers, visited);
        }
    }
```
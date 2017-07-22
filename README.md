1. api_doc_使用示例
2. Hystrix使用示例

3. 回滚代码：http://blog.csdn.net/qq8427003/article/details/64920987
3.1. 使用revert ： 
git revert hash(B)..HEAD  回滚第B次提交之后的代码
3.2. 使用reset
git reset hash(B) --hard 回滚第B次提交之后的代码
当执行 git push 的时候，会被提示不能提交。
但凡修改历史跟origin有冲突的，都必须强项覆盖提交，这时大胆执行git push -f同步到origin.
git push -f origin master



revert hash 这个hash为对应想删除的commit
revert hash..HEAD 这个hash对应的commit不会被删除，会删除到它的后一次commit
revert 会产生新的提交，并不会真正删除history。

add 3
add 4
add 5
add 6
add 7
add 11
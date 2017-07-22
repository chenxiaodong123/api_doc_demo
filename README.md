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

4. Git  reset revert cherry-pick
   1.查看git日志使用： git reflog
   2. 回滚代码使用revert  git revert hash(B)..HEAD  回滚第B次提交之后的代码
   3.master回滚之后，dev merge 了master会丢失回滚前的代码， 如何找到回滚之前的代码呢？ 使用cherry-pick
      Git cherry-pick log_id : 能够还原某次提交的代码， 如果显示有冲突， 解决冲突 （简单的 accept theirs即可）
      如果有多次commit操作， 分别cherry-pick 出来？ 问题： 有没有更简洁的方法？
     有： git cherry-pick 3ac8c80..2e9298d  选择恢复的日志区间
             如果遇到冲突： 解决冲突， accept theirs
             然后继续之前的cherry-pick操作， 才能完成整个恢复： git cherry-pick —continue

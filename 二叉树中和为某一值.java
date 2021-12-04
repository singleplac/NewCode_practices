public class Solution {
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
//遍历时添加路径，并累加
//如果是叶结点且刚好sum=val, return true
//当前结点不是叶结点，则继续访问它的子结点。当前结点访问结束后，递归函数将自动回到它的父结点
//在函数退出之前要在路径上删除当前结点并减去当前结点的值，以确保返回父结点时路径刚好是从根节点到父结点的路径。
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
       dfs (root,sum);
       return hashPath;
    }
    int sum=0;
    boolean hashPath = false;
    public void dfs(TreeNode root, int target){
        if(root==null){
            return ;
        }
        target  = target-root.val;
        if(root.left==null && root.right ==null && target ==0){
            hashPath = true;
            return;
        }
        dfs(root.left,target);
        dfs(root.right,target);
    }
}

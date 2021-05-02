// https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
// 2nd May


class Solution {
    public TreeNode recoverFromPreorder(String S) {
        Map<Integer,TreeNode> my = new HashMap<>();
        int n = S.length();
        for(int i=0;i<n;){
            int level=0,num=0;
            
            while(i<n&&S.charAt(i)=='-'){
                level++;
                i++;
            }
            
            while(i<n&&S.charAt(i)>='0'&&S.charAt(i)<='9'){
                num = num*10 + (S.charAt(i)-'0');
                i++;
            }
            TreeNode curNode = new TreeNode(num);
            my.put(level,curNode);
            if(level>0){
                TreeNode par = my.get(level-1);
                if(par.left==null)par.left=curNode;
                else par.right=curNode;
            }
            
        }
        
        return my.get(0);
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst=new ArrayList<>();
        if(root==null){
            return lst;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> lvl= new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                lvl.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            lst.add(lvl);
        }
        return lst;
        }
}
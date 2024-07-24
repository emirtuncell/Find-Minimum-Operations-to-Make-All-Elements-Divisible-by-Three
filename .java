class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);  //diziyi sıraladım.
        int counter=0;      //sayaç ekledim.

        for(int i=0; i<nums.length; i++){  //eğer sayının 3 ile bölümünden kalan 0 ise bir işlem yapmaya gerek yok.
            if(nums[i]%3==0){
                continue;
            }
            else{  //ancak 3'ün katı değilse tek işlem ile 3'ün katıl olabilir.bu yüzden sayaca 1 ekledim.
                counter++;
            }
        }

        return counter;//sayacı döndürdüm.
    }
}

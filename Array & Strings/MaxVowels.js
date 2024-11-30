/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function(s, k) {
    const isVowel = (char) => "aeiou".includes(char);

    let maxvowels = 0;
    let currentMax = 0;
    for(let i = 0; i < k; i++)
    {
        if(isVowel(s[i])) currentMax++;
    }
    maxvowels = currentMax;

    for(let i = k; i < s.length ; i++)
    {
        if(isVowel(s[i])) currentMax++;
        if(isVowel(s[i-k])) currentMax--;
        maxvowels = Math.max(maxvowels, currentMax)
    }
    return maxvowels;
};
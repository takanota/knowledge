package org.support.project.knowledge.logic.activity;

public interface ActivityProcessor {
    /*
     * 種類  | 獲得のタイプ  | ポイント付与先 | ポイント    | 獲得タイプの意味
     * 1    | 11          | 記事登録者    | 50       | 記事を投稿したら投稿者にポイント追加
     * 1    | 12          | 記事         | 50       | 登録された記事のポイント初期値
     * 2    | 21          | 参照者       | 1        | 記事を参照するアクションを行うと、参照者にポイント追加（一つの記事に付き1回のみ）
     * 2    | 22          | 記事登録者    | 1        | 自分が登録された記事が参照されたら、登録者にポイント追加（一つの記事に対し、参照者毎に1回のみ）
     * 2    | 23          | 記事         | 1        | 記事が参照されると、その記事のポイントが追加（一つの記事に対し、参照者毎に1回のみ）
     * 3    | 31          | 参照者       | 2        | 記事にイイネのアクションを行うと、参照者にポイント追加（一つの記事に付き1回のみ）
     * 3    | 32          | 記事登録者    | 10       | 自分が登録された記事にイイネがついたら、登録者にポイント追加（一つの記事に対し、参照者毎に1回のみ）
     * 3    | 33          | 記事         | 10       | 記事が参照されると、その記事のポイントが追加（一つの記事に対し、参照者毎に1回のみ）
     * 4    | 41          | 参照者       | 0        | ストックした場合、ストックした人にポイントは付与しない
     * 4    | 42          | 記事登録者    | 2       | 記事の登録者にポイント追加（一つの記事に対し、参照者毎に1回のみ）
     * 4    | 43          | 記事         | 2       | 記事のポイントが追加（一つの記事に対し、参照者毎に1回のみ）
     * 5    | 51          | 参照者       | 3        | アンケート回答者にポイント付与
     * 5    | 52          | 記事登録者    | 3       | 記事の登録者にポイント追加（一つの記事に対し、参照者毎に1回のみ）
     * 5    | 53          | 記事         | 3       | 記事のポイントが追加（一つの記事に対し、参照者毎に1回のみ）
     * 6    | 61          | 参照者       | 5        | イベント参加者にポイント付与
     * 6    | 62          | 記事登録者    | 5       | 記事の登録者にポイント追加（一つの記事に対し、参照者毎に1回のみ）
     * 6    | 63          | 記事         | 5       | 記事のポイントが追加（一つの記事に対し、参照者毎に1回のみ）
     * 101  | 1011        | 登録者       | 20       | コメントを投稿すると、投稿者にポイント追加
     * 101  | 1012        | 記事         | 20       | 記事にコメントが付くと、その記事に対しポイント追加
     * 102  | 1021        | 参照者       | 2       | イイネを押すと、押した人にポイント追加
     * 102  | 1022        | 登録者       | 10       | コメントにイイネが付くと、そのコメントを登録したユーザにポイントが付く
     * 102  | 1023        | 記事         | 10       | コメントにイイネがつくと、そのコメントの記事に対しポイント追加
     * -6   | -61         | 参照者       | 5        | イベント参加者にポイント付与（取り消しなのでマイナス）
     * -6   | -62         | 記事登録者    | 5       | 記事の登録者にポイント追加（取り消しなのでマイナス）
     * -6   | -63         | 記事         | 5       | 記事のポイントが追加（取り消しなのでマイナス）     * 
     */
    public static final int TYPE_KNOWLEDGE_DO_INSERT = 11;
    public static final int TYPE_KNOWLEDGE_INSERTED = 12;
    public static final int TYPE_KNOWLEDGE_DO_SHOW = 21;
    public static final int TYPE_KNOWLEDGE_SHOWN_BY_OHER = 22;
    public static final int TYPE_KNOWLEDGE_SHOWN = 23;
    public static final int TYPE_KNOWLEDGE_DO_LIKE = 31;
    public static final int TYPE_KNOWLEDGE_LIKED_BY_OHER = 32;
    public static final int TYPE_KNOWLEDGE_LIKED = 33;
    public static final int TYPE_KNOWLEDGE_DO_STOCK = 41;
    public static final int TYPE_KNOWLEDGE_STOCKED_BY_OHER = 42;
    public static final int TYPE_KNOWLEDGE_STOCKED = 43;
    public static final int TYPE_KNOWLEDGE_DO_ANSWER = 51;
    public static final int TYPE_KNOWLEDGE_ANSWERD_BY_OHER = 52;
    public static final int TYPE_KNOWLEDGE_ANSWERD = 53;
    
    void execute() throws Exception;
}

drop table event;

create table event (
    id integer primary key,
    title varchar2(100) not null,
    season varchar2(10) not null,
    presenter varchar2(100) not null,
    event_date timestamp not null
);

insert into
    event (id, title, season, presenter, event_date)
values
    (
        108009,
        'Kubernetesで作るコンテナベースのCI☆CDの夕べ',
        '1',
        'h',
        '2018-12-20 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        113733,
        'Microservicesの運用・監視',
        '1',
        's',
        '2019-01-25 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        119344,
        'JDK開発者が語るMicroservicesなJavaアプリケーション',
        '1',
        'i',
        '2019-03-07 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        122445,
        'Hyperledger Fabricアプリケーション設計入門ガイド',
        '1',
        'n',
        '2019-03-28 18:00:00'
    );

insert into
    event (
        id,
        title,
        season,
        presenter,
        event_date
    )
values
    (
        124819,
        '避けては通れない！認証・認可',
        '1',
        'i',
        '2019-04-19 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        127773,
        '人にもマシンにも優しいAPIのエコシステム',
        '1',
        'k',
        '2019-05-10 18:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        136115,
        'これからはじめる！Kubernetes基礎',
        '2',
        's',
        '2019-07-17 18:00:00'
    );

insert into
    event (
        id,
        title,
        season,
        presenter,
        event_date
    )
values
    (
        140792,
        '一体何モノなの？GraalVM入門編',
        '2',
        's',
        '2019-09-19 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        147285,
        'Serverlessな世界をのぞいてみよう！',
        '2',
        's',
        '2019-10-31 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        152768,
        'Oracle Cloudで考える可用性アーキテクチャ',
        'premium',
        'm',
        '2019-11-29 18:30:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        155389,
        'Cloud Native時代のモダンJavaの世界',
        '2',
        'k',
        '2019-12-19 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        158992,
        '変幻自在♪広がるKubernetesのエコシステム',
        '2',
        'n',
        '2020-01-28 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        164814,
        'クラウド・アプリケーションのパフォーマンス',
        '2',
        'y',
        '2020-02-28 19:00:00'
    );

insert into
    event (
        id,
        title,
        season,
        presenter,
        event_date
    )
values
    (
        169396,
        'Cloud Native × Streaming はじめの一歩',
        '2',
        's',
        '2020-05-13 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        178405,
        'Cloud Native流のストレージ管理',
        '3',
        'n',
        '2020-07-30 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        183712,
        'サービス間通信のトレンド - gRPC & GraphQL入門',
        '3',
        'n',
        '2020-08-27 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        186070,
        'Kubernetesクラスタの管理術',
        '3',
        'n',
        '2020-09-30 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        189340,
        '挑戦！JavaでReactiveプログラミング',
        '3',
        'k',
        '2020-10-28 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        193618,
        '明解！NoSQLの勘所',
        '3',
        'n',
        '2020-11-25 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        197023,
        'コンテナ・ランタイムの未来',
        '3',
        'n',
        '2020-12-23 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        203362,
        'Oracle Cloud - Cloud Native 2021',
        'premium',
        'n',
        '2021-03-10 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        206439,
        '生体認証のイロハ',
        '4',
        'k',
        '2021-04-07 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        207869,
        'Kubernetesのネットワーク',
        '4',
        'n',
        '2021-05-12 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        211934,
        'CI/CD 最新事情',
        '4',
        'i',
        '2021-06-09 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        211935,
        'マイクロサービスとデータマネジメント',
        'premium',
        'y',
        '2021-06-30 19:00:00'
    );

insert into
    event (id, title, season, presenter, event_date)
values
    (
        215000,
        'マイクロサービスの認証・認可とJWT',
        '4',
        'k',
        '2021-07-07 19:00:00'
    );

commit;